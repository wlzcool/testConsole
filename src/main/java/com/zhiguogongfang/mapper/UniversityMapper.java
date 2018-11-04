package com.zhiguogongfang.mapper;

import com.zhiguogongfang.domain.University;
import com.zhiguogongfang.domain.UniversityAttribute;

import java.util.List;

public interface UniversityMapper {
    public List<University> selectUniversityAttribute() throws Exception;

    public void deleteUniversityAttribute(UniversityAttribute ua) throws Exception;
}
