package data.dto;

public class SellerCompanyDto {
	private int seller_id; //판매자 아이디
	private int seller_company_number; //사업자 번호
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
	
	public int getSeller_company_number() {
		return seller_company_number;
	}
	public void setSeller_company_number(int seller_company_number) {
		this.seller_company_number = seller_company_number;
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
