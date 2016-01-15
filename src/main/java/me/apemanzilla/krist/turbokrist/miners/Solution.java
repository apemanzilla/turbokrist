package me.apemanzilla.krist.turbokrist.miners;

import me.apemanzilla.kristapi.types.KristAddress;

/**
 * Represents a solution that can be submitted to the Krist syncnode.
 * 
 * @author apemanzilla
 *
 */
public class Solution {

	private final String block;
	private final KristAddress address;
	private final String nonce;

	// TODO: Implement checking of solution validity in constructors

	public Solution(String block, KristAddress address, String nonce) {
		this.block = block;
		this.address = address;
		this.nonce = nonce;
	}

	public Solution(String block, String address, String nonce) {
		this.block = block;
		this.address = KristAddress.auto(address);
		this.nonce = nonce;
	}

	public String getBlock() {
		return block;
	}

	public KristAddress getAddress() {
		return address;
	}

	public String getNonce() {
		return nonce;
	}

}