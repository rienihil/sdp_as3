class LowPriorityHandler extends TaskHandler {
    public void handleRequest(Task task) {
        if (task.getPriority() == TaskPriority.LOW) {
            System.out.println("Processing low-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(task);
        }
    }
}