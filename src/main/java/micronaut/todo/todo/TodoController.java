package micronaut.todo.todo;

import javax.inject.Inject;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("api/todos")
public class TodoController {

  @Inject
  private TodoService todoService;

  @Get("/")
  public HttpResponse findAll() {
    return HttpResponse.ok(todoService.findAll());
  }

  @Post("/")
  public HttpResponse add(@Body Todo todo) {
    return HttpResponse.ok(todoService.add(todo));
  }
}
