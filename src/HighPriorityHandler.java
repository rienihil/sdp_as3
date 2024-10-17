class HighPriorityHandler extends TaskHandler {
    public void handleRequest(Task task) {
        if (task.getPriority() == TaskPriority.HIGH) {
            System.out.println("Processing high-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(task);
        }
    }
}