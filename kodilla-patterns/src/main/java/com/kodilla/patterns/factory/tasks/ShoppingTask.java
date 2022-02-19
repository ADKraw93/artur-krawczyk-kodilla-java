package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: " + taskName + " is executed.\n" +
                whatToBuy + " has been bought in quantity of: " + quantity);
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
