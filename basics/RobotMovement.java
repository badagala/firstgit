package com.gss.basics;
public class RobotMovement {

    // Method to execute commands and return the robot's final location
    public static void executeCommands(String commands) {
        // Initial position and direction
        int x = 0, y = 0;
        String direction = "S";  // Start facing from South

        // Directional mappings to coordinate changes (row, column)
        // Key is direction ('N', 'E', 'S', 'W'), value is the change in coordinates (dx, dy)
        int[] dx = {-1, 0, 1, 0};  // Change in row for N, E, S, W
        int[] dy = {0, 1, 0, -1};  // Change in column for N, E, S, W
      //  String[] directions = {"N", "E", "S", "W"};

        // Iterate through each command in the input string
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == 'M') {
                // Move in the current direction
                int dirIndex = getDirectionIndex(direction);
                int newX = x + dx[dirIndex];
                int newY = y + dy[dirIndex];

                // Check if the move stays within grid boundaries (5x4 grid)
                if (newX >= 0 && newX < 5 && newY >= 0 && newY < 4) {
                    x = newX;
                    y = newY;
                }
            } else if (command == 'N' || command == 'E' || command == 'S' || command == 'W') {
                // Update direction if it's different from current direction
                if (!String.valueOf(command).equals(direction)) {
                    direction = String.valueOf(command);
                }
            }
        }

        // Output the final position and facing direction
        System.out.println("Robot Location: (" + x + "," + y + "," + direction + ")");
    }

    // Helper method to get the index of the current direction
    private static int getDirectionIndex(String direction) {
        switch (direction) {
            case "N":
                return 0;  // North
            case "E":
                return 1;  // East
            case "S":
                return 2;  // South
            case "W":
                return 3;  // West
            default:
                return -1; // Invalid direction
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String commands = "MSMMEMM";  // Test input
        executeCommands(commands);    // Execute the commands and print the final location
    }
    
    //online source : Chatgpt(Basic understanding about the project)
	/*
	 * 1)The program simulates the movement of a robot on a 5x4 grid. 2)The robot
	 * can follow directional instructions ('N', 'E', 'S', 'W') and movement
	 * instructions ('M') based on the current direction it is facing. 3)The
	 * solution was implemented in Java, and the robot's position is updated
	 * according to the given command sequence. 4)The grid boundaries are respected,
	 * and the robot does not move outside of the grid. It also avoids unnecessary
	 * direction changes.
	 */
}
