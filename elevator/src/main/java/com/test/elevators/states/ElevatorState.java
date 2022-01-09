package com.test.elevators.states;

import com.test.elevators.classes.Elevator;

public interface ElevatorState {

	void up(Elevator elevator, int where);

	void down(Elevator elevator, int where);

	void rest(Elevator elevator);

	void stop(Elevator elevator);
}
