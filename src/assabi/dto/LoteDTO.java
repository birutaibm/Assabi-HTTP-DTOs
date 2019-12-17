package assabi.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LoteDTO<I, O> {
	class Created {
		private final I input;
		private final O output;
		
		public boolean isSuccess() {
			return output != null;
		}
		
		public I getInput() {
			return input;
		}
		
		public O getOutput() {
			return output;
		}
		
		public Created(I input, O output) {
			super();
			this.input = input;
			this.output = output;
			System.out.println("Create " + input + " => " + output);
		}
	}
	
	private List<I> fails;
	private List<O> successes;
	
	public LoteDTO() {
		fails = new ArrayList<>();
		successes = new ArrayList<>();
	}
	
	public List<I> getFails() {
		return fails;
	}
	
	public List<O> getSuccesses() {
		return successes;
	}
	
	public void add(I input, ResponseEntity<O> output) {
		if (output.getStatusCode().is2xxSuccessful())
			add(new Created(input, output.getBody()));
		else
			add(new Created(input, null));
	}
	
	public ResponseEntity<LoteDTO<I, O>> encapsulate() {
		if (fails.isEmpty())
			return ResponseEntity.ok(this);
		return ResponseEntity.badRequest().body(this);
	}
	
	private void add(Created element) {
		if (element.isSuccess())
			successes.add(element.getOutput());
		else
			fails.add(element.getInput());
	}
}