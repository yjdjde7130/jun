package com.junapp.service.bpm;

import com.junapp.entity.BPMInstanceEntity;

public interface IBPMService {

	public BPMInstanceEntity getBPMInstanceEntityByInstanceId(String instanceId);
}
