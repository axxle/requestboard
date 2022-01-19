package ru.axxle.requestboard.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.axxle.requestboard.model.InstanceRequest;
import ru.axxle.requestboard.service.InstanceRequestService;

@RestController
@RequestMapping("/fakeinvoke")
public class InstanceRequestController {

	@Autowired
	private InstanceRequestService service;

	@GetMapping("/log")  //for dev localhost:1988/fakeinvoke/log
	public InstanceRequest[] getLog() {
		return service.getAllOrderDesc();
	}

	@PostMapping("/log")
	public void saveTestServiceInvoke(@RequestBody InstanceRequest model) {
		service.create(model);
	}

	public InstanceRequestService getService() {
		return service;
	}

	public void setService(InstanceRequestService service) {
		this.service = service;
	}
}