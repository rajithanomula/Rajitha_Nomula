package com.example.Exceptionhandlinglogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/sample")
    public SampleData getSampleData() {
        try {
            // code to retrieve data from database or external API
            SampleData data = new SampleData();
            data.setId(1);
            data.setName("John");
            data.setAge(30);

            LOGGER.info("Sample data retrieved successfully");
            
            return data;
        } catch (Exception e) {
            // handle the exception here
            LOGGER.error("Error retrieving sample data", e);
            return null;
        }
    }


class SampleData {
    private int id;
    private String name;
    private int age;
	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}
	//public void setName(String string) {
		// TODO Auto-generated method stub
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
		
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
	}
}
	

    // getters and setters for the fields






