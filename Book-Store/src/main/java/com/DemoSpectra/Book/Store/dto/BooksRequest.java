
package com.DemoSpectra.Book.Store.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BooksRequest {
	private Long id;
    @NotNull(message="username shouldnot be null")
	private String name;
    @NotBlank(message="Author not Blank")
	private String author;
	@NotNull(message="category shoudn't be null")
	private String catagory;
	
	private String language;
	@NotNull(message="Price shoudn't be null")
	private Long Price;
	
}
