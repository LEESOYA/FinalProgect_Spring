package seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import data.dto.SellerDto;
import data.seller.service.SellerServiceInter;
import upload.util.SpringFileWrite;

@RestController
@CrossOrigin
public class SellerController {

	@Autowired
	private SellerServiceInter service;
	
	//이미지 파일명
	String saveImagename;	
	
	@RequestMapping(value = "/seller/companyFile", consumes = {"multipart/form-data"}, method = RequestMethod.POST)
	public String fileUpload(MultipartHttpServletRequest request, @RequestParam MultipartFile uploadFile) {
		System.out.println("seller>>companyImage>>"+uploadFile.getOriginalFilename());
		
		//업로드할 경로구하기
		String path = request.getSession().getServletContext().getRealPath("/WEB-INF/Image/companyImage");
		System.out.println("companyImage path="+path);
		
		//실제 폴더에 이미지 저장
		SpringFileWrite sfw = new SpringFileWrite();
		saveImagename=uploadFile.getOriginalFilename();
		
		sfw.writeFileRename(uploadFile, path, saveImagename);
		
		return saveImagename; //파일명 리턴
		}

	//판매자 insert (seller, seller_company)
	@PostMapping("/seller/add")
	public String insert(@RequestBody SellerDto dto) {
		//전달받은 dto에서 저장할 이미지명은 변경후 db에 insert
		dto.setSeller_company_image(saveImagename);
		service.insertSeller(dto);

		return "seller Insert Success";
	}
}
