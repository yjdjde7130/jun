package com.junapp.entity;

public class BPMInstanceEntity {

	/**
	 * 流程实例ID
	 */
	protected String bpmInstanceId;

	/**
	 * 流程实例父ID
	 */
	protected String bpmInstanceParentId;

	/**
	 * 流程实例的定义对象
	 */
	protected BPMDefinitionEntity bpmDefinitionEntity;

	/**
	 * 流程实例关联的业务主键
	 */
	protected String BusinessKey;

}
