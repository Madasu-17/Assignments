package com.zensar.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.controller.service.repository.StundentRepository;
import com.zensar.dto.StudentDto;
import com.zensar.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StundentRepository studentRepository;
	@Autowired
	private ModelMapper modelMapper;
	private Student student;

	public StudentServiceImpl() {

	}

	@Override
	public StudentDto getStudent(int studentId) {
		Student student = studentRepository.findById(studentId).get();
		//StudentDto mapToDto = maptoDto(student);
		
		return modelMapper.map(student, StudentDto.class);
		

	}

	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> listOfStudents =studentRepository.findAll();
		List<StudentDto>listOfStudentDto=new ArrayList<StudentDto>();
		
		for(Student student:listOfStudents) {
			//listOfStudentDto.add(maptoDto(student));
			listOfStudentDto.add(modelMapper.map(student, StudentDto.class));
		}
		return listOfStudentDto;
	}

	@Override
	public StudentDto insertStudent(StudentDto studentDto) {
		//Student student = maptoEntity(studentDto);
		Student student= modelMapper.map(studentDto, Student.class);
		Student insertedStudent = studentRepository.save(student);
		//StudentDto mapToDto = maptoDto(insertedStudent);
		return modelMapper.map(insertedStudent, StudentDto.class);
		

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
	}

	@Override
	public void updateStudent(int studentId, StudentDto studentDto) {
		//Student student = maptoEntity(studentDto);
		Student student= modelMapper.map(studentDto, Student.class);
		studentRepository.save(student);
	}

	/*public Student maptoEntity(StudentDto studentDto) {
		Student student = new Student();
		student.setStudentId(studentDto.getStudentId());
		student.setStudentName(studentDto.getStudentName());
		student.setStudentAge(studentDto.getStudentAge());
		return student;

	}

	public StudentDto maptoDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setStudentId(student.getStudentId());
		dto.setStudentName(student.getStudentName());
		dto.setStudentAge(student.getStudentAge());
		return dto;

	}*/

}
