package com.greatlearning.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.Library;
import com.greatlearning.library.repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl 
{
	@Autowired
	LibraryRepository readRepository;
	
	public List<Library> getAllLibrary()
	{
		return readRepository.findAll();
	}

}
