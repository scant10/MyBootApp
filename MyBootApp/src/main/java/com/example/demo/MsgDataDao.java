package com.example.demo;

import java.util.List;

import com.example.demo.domain.MsgData;

public interface MsgDataDao<T> {
	
	public List<MsgData> getAll();
	public MsgData findById(long id);

}
