package com.gl.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.gl.library.Entity.Library;
import com.gl.library.repository.LibraryRepo;

@Service
public class LibraryService {
	
	@Autowired 
	LibraryRepo libraryRepo;
	
	
	public List<Library> getAlllibrary() {
		
		return libraryRepo.findAll();
		
	}
	
	public List<Library> getAllLibrarieswithNoBook(){
		Library librarieswithNoBook = new Library();
		librarieswithNoBook.setCommaSeparatedBookname("");
		//important
		ExampleMatcher exMatcher = ExampleMatcher.matching().withMatcher("commaSeparatedBookname",ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("id","name");
		Example<Library> ex = Example.of(librarieswithNoBook ,exMatcher);
		return libraryRepo.findAll(ex);
	}

}
