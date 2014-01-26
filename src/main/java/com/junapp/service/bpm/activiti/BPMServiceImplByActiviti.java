package com.junapp.service.bpm.activiti;

import javax.annotation.Resource;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;
import com.junapp.entity.BPMInstanceEntity;
import com.junapp.service.bpm.IBPMService;

@Service("bpmServiceByActitivi")
public class BPMServiceImplByActiviti implements IBPMService {

	@Resource(name = "runtimeService")
	private RuntimeService runtimeService;

	@Resource(name = "repositoryService")
	private RepositoryService repositoryService;

	@Resource(name = "taskService")
	private TaskService taskService;

	@Resource(name = "historyService")
	private HistoryService historyService;

	@Override
	public BPMInstanceEntity getBPMInstanceEntityByInstanceId(String instanceId) {
		ProcessInstance processInstance = runtimeService
				.createProcessInstanceQuery().processInstanceId(instanceId)
				.singleResult();
		return convertToBPMInstanceEntity(processInstance);
	}

	private BPMInstanceEntity convertToBPMInstanceEntity(
			ProcessInstance processInstance) {
		BPMInstanceEntity bpmInstanceEntity = new BPMInstanceEntity();

		return null;
	}

}
