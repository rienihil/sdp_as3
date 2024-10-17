class TaskMediator {
    private TaskHandler handlerChain;

    public TaskMediator(TaskHandler handlerChain) {
        this.handlerChain = handlerChain;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void handleTask(Task task) {
        handlerChain.handleRequest(task);
    }
}