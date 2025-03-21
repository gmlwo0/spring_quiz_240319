package com.quiz.lesson04.domain;

import java.time.LocalDate;

public class Seller {
		private int	id;
		private String nickname;
		private String profileImageUrl;
		private double	temperature;
		private LocalDate createdAt;
		private LocalDate updatedAt;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getProfileImageUrl() {
			return profileImageUrl;
		}
		public void setProfileImageUrl(String profileImageUrl) {
			this.profileImageUrl = profileImageUrl;
		}
		public double getTemperature() {
			return temperature;
		}
		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}
		public LocalDate getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDate createdAt) {
			this.createdAt = createdAt;
		}
		public LocalDate getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(LocalDate updatedAt) {
			this.updatedAt = updatedAt;
		}
		
		
}
