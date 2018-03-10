package com.dev.game.domain.enams;

public enum Role {
	USER(1), MANAGER(2), ADMIN(3);

	private Integer roleNumber;

	private Role(Integer roleNumber) {
		this.roleNumber = roleNumber;
	}

	public Integer getRoleNumber() {
		return roleNumber;
	}

	public static Role valueOf(Integer courseNumber) {
		Role status = null;
		Role[] values = values();
		for (Role item : values) {
			if (courseNumber.equals(item.getRoleNumber())) {
				status = item;
				break;
			}
		}
		return status;
	}

}
