package com.example.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@CrossOrigin
@Api(value = "Test Controller")
public class TestController {

	@ApiOperation(value = "Get the Name", response = String.class)
	@GetMapping("/getName")
	public ResponseEntity<String> getName() {
		return ResponseEntity.ok().body("Charan H C ");
	}

	@ApiOperation(value = "Update the Name", response = ResponseEntity.class)
	@GetMapping("/updateName")
	public ResponseEntity<String> updateName(@RequestParam String name) {
		return ResponseEntity.ok().body(name);
	}

	@ApiOperation(value = "Add the Name", response = ResponseEntity.class)
	@PostMapping("/addName")
	public ResponseEntity<Map> addData(@RequestBody Map map) {
		return ResponseEntity.ok().body(map);
	}
}
