class CreateTaskCommand implements Command {
    private Task task;

    public CreateTaskCommand(Task task) {
        this.task = task;
    }

    public void execute() {
        System.out.println("Creating task with priority: " + task.getPriority());
    }
}