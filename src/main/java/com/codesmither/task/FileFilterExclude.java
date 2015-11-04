package com.codesmither.task;

import java.io.File;

/**
 * �ļ��ų�ʵ��
 * Created by SCWANG on 2015-07-04.
 */
public class FileFilterExclude implements FileFilter{

    FileFilterInclude include;

    public FileFilterExclude(String[] fileRegexs,String[] pathRegexs){
        include = new FileFilterInclude(fileRegexs,pathRegexs);
    }

    @Override
    public boolean filterFile(File file) {
        return !include.filterFile(file);
    }

    @Override
    public boolean filterPath(File file) {
        return !include.filterPath(file);
    }
}
