package micronaut.todo.todo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity(name = "todo")
@Table(schema = "todo_app")
public class Todo {
  @Id
  private Long id;
  private String isCompleted;
  private String taskName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(String isCompleted) {
    this.isCompleted = isCompleted;
  }

  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }
}
