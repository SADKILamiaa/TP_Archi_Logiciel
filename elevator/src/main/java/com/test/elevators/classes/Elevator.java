package com.test.elevators.classes;

import com.test.elevators.states.ElevatorState;

public interface Elevator {

	int getCurrentFloor();

	void setCurrentFloor(int elevatorCurrentFloor);

	ElevatorState getElevatorState();

	void setElevatorState(ElevatorState elevatorNewState);

	int getNumberOfFloors();

	String getId();

	void serve(int floor);

	void stop(int floor);
}
