package data.dto;

import java.sql.Timestamp;

public class LoginDto {
		private int user_id;
		private String user_nickname;
		private String user_name;
		private String user_email;
		private int user_birth;
		private String user_hp;
		private String user_pass;
		private String user_addr;
		private int user_total_goods_cost;
		private int user_total_booking_cost;
		private String user_grade;
		private int member_type;
		private Timestamp user_sign_date;
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getUser_nickname() {
			return user_nickname;
		}
		public void setUser_nickname(String user_nickname) {
			this.user_nickname = user_nickname;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getUser_email() {
			return user_email;
		}
		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}
	
		public String getUser_hp() {
			return user_hp;
		}
		public void setUser_hp(String user_hp) {
			this.user_hp = user_hp;
		}
		public String getUser_pass() {
			return user_pass;
		}
		public void setUser_pass(String user_pass) {
			this.user_pass = user_pass;
		}
		public String getUser_addr() {
			return user_addr;
		}
		public void setUser_addr(String user_addr) {
			this.user_addr = user_addr;
		}
		public int getUser_total_goods_cost() {
			return user_total_goods_cost;
		}
		public void setUser_total_goods_cost(int user_total_goods_cost) {
			this.user_total_goods_cost = user_total_goods_cost;
		}
		public int getUser_total_booking_cost() {
			return user_total_booking_cost;
		}
		public void setUser_total_booking_cost(int user_total_booking_cost) {
			this.user_total_booking_cost = user_total_booking_cost;
		}
		public String getUser_grade() {
			return user_grade;
		}
		public void setUser_grade(String user_grade) {
			this.user_grade = user_grade;
		}
		public int getMember_type() {
			return member_type;
		}
		public void setMember_type(int member_type) {
			this.member_type = member_type;
		}
		
		public Timestamp getUser_sign_date() {
			return user_sign_date;
		}
		public void setUser_sign_date(Timestamp user_sign_date) {
			this.user_sign_date = user_sign_date;
		}
		public int getUser_birth() {
			return user_birth;
		}
		public void setUser_birth(int user_birth) {
			this.user_birth = user_birth;
		}
		@Override
		public String toString() {
			return "[" + "user_id:" + user_id + ", user_nickname:" + user_nickname + ", user_name:" + user_name
					+ ", user_email:" + user_email + ", user_birth:" + user_birth + ", user_hp:" + user_hp
					+ ", user_pass:" + user_pass + ", user_addr:" + user_addr + ", user_total_goods_cost:"
					+ user_total_goods_cost + ", user_total_booking_cost:" + user_total_booking_cost + ", user_grade:"
					+ user_grade + ", member_type:" + member_type + ", user_sign_date:" + user_sign_date + "]";
		}
		
		
		
		
}
