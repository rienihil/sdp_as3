class DeleteTaskCommand implements Command {
    private Task task;

    public DeleteTaskCommand(Task task) {
        this.task = task;
    }

    public void execute() {
        System.out.println("Deleting task with priority: " + task.getPriority());
    }
}