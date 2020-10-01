package micronaut.todo.todo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TodoService {

  @Inject
  private TodoRepository todoRepository;

  public Iterable<Todo> findAll() {
    return todoRepository.findAll();
  }
  
  public Todo add(Todo todo) {
    return todoRepository.save(todo);
  }
}
