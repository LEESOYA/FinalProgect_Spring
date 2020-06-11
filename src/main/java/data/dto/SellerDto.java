package data.dto;


public class SellerDto {
	private int seller_id; //판매자 아이디
	private String seller_email; //이메일
	private String seller_pass; //비밀번호
	private int seller_company_number; //사업자 번호
	private int member_type; //가입자 타입 (판매자 : 2)
	private int seller_permit; //승인 여부 (승인: 1, 미승인:0)
	private String seller_company_name;
	private String seller_company_image;
	private String seller_company_addr;
	private String seller_company_type1;//업태
	private String seller_company_type2;//업종
	private String seller_company_hp;
	
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public String getSeller_email() {
		return seller_email;
	}
	public void setSeller_email(String seller_email) {
		this.seller_email = seller_email;
	}
	public String getSeller_pass() {
		return seller_pass;
	}
	public void setSeller_pass(String seller_pass) {
		this.seller_pass = seller_pass;
	}
	
	public int getSeller_company_number() {
		return seller_company_number;
	}
	public void setSeller_company_number(int seller_company_number) {
		this.seller_company_number = seller_company_number;
	}
	public int getMember_type() {
		return member_type;
	}
	public void setMember_type(int member_type) {
		this.member_type = member_type;
	}
	public int getSeller_permit() {
		return seller_permit;
	}
	public void setSeller_permit(int seller_permit) {
		this.seller_permit = seller_permit;
	}
	public String getSeller_company_name() {
		return seller_company_name;
	}
	public void setSeller_company_name(String seller_company_name) {
		this.seller_company_name = seller_company_name;
	}
	public String getSeller_company_image() {
		return seller_company_image;
	}
	public void setSeller_company_image(String seller_company_image) {
		this.seller_company_image = seller_company_image;
	}
	public String getSeller_company_addr() {
		return seller_company_addr;
	}
	public void setSeller_company_addr(String seller_company_addr) {
		this.seller_company_addr = seller_company_addr;
	}
	public String getSeller_company_type1() {
		return seller_company_type1;
	}
	public void setSeller_company_type1(String seller_company_type1) {
		this.seller_company_type1 = seller_company_type1;
	}
	public String getSeller_company_type2() {
		return seller_company_type2;
	}
	public void setSeller_company_type2(String seller_company_type2) {
		this.seller_company_type2 = seller_company_type2;
	}
	public String getSeller_company_hp() {
		return seller_company_hp;
	}
	public void setSeller_company_hp(String seller_company_hp) {
		this.seller_company_hp = seller_company_hp;
	}
	
}
