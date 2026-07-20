package com.namish.demo.StudentServer.Service;

import com.namish.demo.StudentServer.DTO.createStudentRequestDTO;
import com.namish.demo.StudentServer.DTO.createStudentResponseDTO;
import com.namish.demo.StudentServer.DTO.updateRequestDTO;
import com.namish.demo.StudentServer.DTO.updateResponseDTO;
import com.namish.demo.StudentServer.Entity.Student;
import com.namish.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public createStudentResponseDTO studentValidate(createStudentRequestDTO createStudentRequestDTO) {

        Student student = mapToStudent(createStudentRequestDTO);
        return mapToResponseDTO(student);
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public updateResponseDTO studentUpdate(int id, updateRequestDTO RequestDTO) {

        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return null;
        }

        result.setName(RequestDTO.getName());
        result.setAge(RequestDTO.getAge());
//        result.setDepartment(RequestDTO.getDepartment());
        result.setUpdatedAt(LocalDateTime.now());
        Student updatedStudent = studentRepository.save(result);
        return mapToUpdateResponseDTO(updatedStudent);
    }

    public Student deleteStudent(int id) {
        Student result = studentRepository.findById(id).orElse(null);
        if(result == null) {
            return null;
        }
        studentRepository.delete(result);
        return result;
    }

    private Student mapToStudent(createStudentRequestDTO createStudentRequestDTO) {
        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    private createStudentResponseDTO mapToResponseDTO(Student student) {
        createStudentResponseDTO createStudentResponseDTO = new createStudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDepartment(student.getDepartment());

        return createStudentResponseDTO;

    }
    private updateResponseDTO mapToUpdateResponseDTO(Student student) {
        updateResponseDTO responseDTO = new updateResponseDTO();
        responseDTO.setName(student.getName());
        responseDTO.setAge(student.getAge());
        return  responseDTO;
    }
}