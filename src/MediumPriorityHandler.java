class MediumPriorityHandler extends TaskHandler {
    public void handleRequest(Task task) {
        if (task.getPriority() == TaskPriority.MEDIUM) {
            System.out.println("Processing medium-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(task);
        }
    }
}