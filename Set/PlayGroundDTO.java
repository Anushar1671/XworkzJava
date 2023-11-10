package com.xworkz.app.dto;

import java.io.Serializable;

public class PlayGroundDTO implements Serializable {
	private String gameName;
	private String groundName;
	private boolean popular;
	private int playerNo;

	public PlayGroundDTO() {
		super();
	}

	public PlayGroundDTO(String gameName, String groundName, boolean popular, int playerNo) {
		super();
		this.gameName = gameName;
		this.groundName = groundName;
		this.popular = popular;
		this.playerNo = playerNo;
	}

	@Override
	public String toString() {
		return "PlayGroundDTO [gameName=" + gameName + ", groundName=" + groundName + ", popular=" + popular
				+ ", playerNo=" + playerNo + "]";
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public boolean isPopular() {
		return popular;
	}

	public void setPopular(boolean popular) {
		this.popular = popular;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode in CrackerDTO");
		return 190;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals " + getGameName());
		if (obj != null) {
			if (obj instanceof PlayGroundDTO) {
				PlayGroundDTO dto = (PlayGroundDTO) obj;
				if (dto.getGameName().equals(this.getGameName()) && dto.getGroundName().equals(this.getGroundName())
						&& dto.getPlayerNo() == this.getPlayerNo()) {
					return true;
				}
			}
		}
		return false;
	}

}
