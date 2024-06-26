package com.example.api.demoapi.repository;

import com.example.api.demoapi.model.FIleInfo;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileInfoRepository extends JpaRepository<FIleInfo, Long> {
    Optional<FIleInfo> findByFileName(String fileName);
}
