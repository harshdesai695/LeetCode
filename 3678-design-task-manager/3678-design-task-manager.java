class TaskManager {

    private PriorityQueue<int[]> maxHeap;
    private Map<Integer, int[]> taskDetails;

    public TaskManager(List<List<Integer>> tasks) {
        this.taskDetails = new HashMap<>();
        this.maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        for (List<Integer> task : tasks) {
            add(task.get(0), task.get(1), task.get(2));
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskDetails.put(taskId, new int[] { userId, priority });
        maxHeap.offer(new int[] { priority, taskId });
    }

    public void edit(int taskId, int newPriority) {
        int userId = taskDetails.get(taskId)[0];
        taskDetails.put(taskId, new int[] { userId, newPriority });
        maxHeap.offer(new int[] { newPriority, taskId });
    }

    public void rmv(int taskId) {
        taskDetails.remove(taskId);
    }

    public int execTop() {
        while (!maxHeap.isEmpty()) {
            int[] topTask = maxHeap.peek();
            int priority = topTask[0];
            int taskId = topTask[1];

            if (!taskDetails.containsKey(taskId)) {
                maxHeap.poll();
                continue;
            }

            if (taskDetails.get(taskId)[1] != priority) {
                maxHeap.poll();
                continue;
            }

            break;
        }

        if (maxHeap.isEmpty()) {
            return -1;
        }

        int[] taskToExecute = maxHeap.poll();
        int taskId = taskToExecute[1];

        int userId = taskDetails.get(taskId)[0];
        taskDetails.remove(taskId);

        return userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */