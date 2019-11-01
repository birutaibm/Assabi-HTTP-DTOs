package assabi.dto;

import java.util.Map;

import lombok.Data;

@Data
public class ApplicationDTO {
	private String name;
	private long admin;
	private long scenario;
	private Map<String, Integer> phases;
}
