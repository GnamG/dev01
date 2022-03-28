package com.fc.service.impl;

import com.fc.dao.TbMusicMapper;
import com.fc.entity.TbMusic;
import com.fc.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbMusicServiceImpl implements TbMusicService {
    // 声明dao层接口
    @Autowired
    private TbMusicMapper musicMapper;

    @Override
    public List<TbMusic> findAll() {
        // 不带条件查询全部
        return musicMapper.selectByExample(null);
    }

    @Override
    public TbMusic findById(Integer musicId) {
        return musicMapper.selectByPrimaryKey(musicId);
    }
}
