import java.util.Iterator;
import java.util.List;

class TaskIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int position;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < tasks.size();
    }

    public Task next() {
        return tasks.get(position++);
    }
}