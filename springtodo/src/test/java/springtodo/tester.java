package springtodo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

import com.qa.finalproject.SpringtodoApplication;
import com.qa.finalproject.controller.todoController;
import com.qa.finalproject.model.TodoItem;

class tester {

	@Test
	public void tester() {
		SpringtodoApplication junit = new SpringtodoApplication();
		
		todoController junit1 = new todoController();
		
		TodoItem junit2 = new TodoItem(null, null, false);
		
		junit2.setId((long) 5);
		
		junit2.setTitle((String)"Hello");
		
		junit2.setDone((boolean) true);
		
		junit2.getId();
		
		junit2.getTitle();
		
		junit2.isDone();
		}
}
