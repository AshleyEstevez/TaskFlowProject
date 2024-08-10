/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ashley.agenda.gestortarea;

/**
 *
 * @author PC
 */
public class GestorTarea {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Tarea 1", "Compra super");
        Task task2 = new Task("Tarea 2", "reuniones trabajo");

        manager.addTask(task1);
        manager.addTask(task2);

        task1.markAsCompleted();

        System.out.println("Tareas completadas:");
        for (Task task : manager.getCompletedTasks()) {
            System.out.println(task.getTitle() + ": " + task.getDescription());

        }

    }
}
