package com.tfo.event;

import java.util.ArrayList;
import java.util.List;

public class EventGroup {

	public List<Event> GroupDateTimeEvent(List<Event> events, List<Stage> stages) {

		List<String> stageLocIdList = new ArrayList<>();
		for (Stage stage : stages) {
			stageLocIdList.add(stage.getLocationId());
		}

		for (Event event : events) {
			int pre = -1;
			int next = -1;
			if (stageLocIdList.contains(event.getLocationId())) {
				event.setGroupId(2 * stageLocIdList.indexOf(event.getLocationId()));
			} else {
				// First Event
				if (events.indexOf(event) == 0) {
					for (int i = events.indexOf(event) + 1; i < events.size(); i++) {
						if (stageLocIdList.contains(events.get(i).getLocationId())) {
							next = 2 * stageLocIdList.indexOf(events.get(i).getLocationId());
							break;
						}
					}
					// Last Event
				} else if (events.indexOf(event) == events.size() - 1) {
					for (int i = events.size() - 2; i >= 0; i--) {
						if (stageLocIdList.contains(events.get(i).getLocationId())) {
							pre = 2 * stageLocIdList.indexOf(events.get(i).getLocationId());
							break;
						}
					}
					// Mid Event
				} else {
					// Find next stop
					for (int i = events.indexOf(event) + 1; i < events.size(); i++) {
						if (stageLocIdList.contains(events.get(i).getLocationId())) {
							next = 2 * stageLocIdList.indexOf(events.get(i).getLocationId());
							break;
						}
					}
					// Find pre stop
					for (int i = events.indexOf(event) - 1; i >= 0; i--) {
						if (stageLocIdList.contains(events.get(i).getLocationId())) {
							pre = 2 * stageLocIdList.indexOf(events.get(i).getLocationId());
							break;
						}
					}

				}

				//set event group id
				event.setGroupId(GetGroupID(pre,  next, stages.size()));
			}
		}

		return events;
	}

	public List<Event> GroupPayLoadEvent(List<Event> events, List<Stage> stages) {
		return events;
	}

	// pre stop, next stop, num of stage
	private int GetGroupID(int pre, int next, int stageNum) {

		if (pre == next) {
			// non stop, other events
			if (pre == -1) {
				return stageNum * 2 - 1;
			// stop
			} else {
				return pre;
			}
		} else {
			// pre in F/M
			if (pre >= 0 && pre < (stageNum - 1) * 2) {
				return pre + 1;
			}else if(pre == (stageNum - 1) * 2){
				return pre;
			}else if(next > 0 && next < (stageNum - 1) * 2){
				return next - 1;
			}else if(next == (stageNum - 1) * 2){
				return next;
			}else{
				return stageNum*2 - 1; 
			}

		}

	}

}
