package cn.itcast.ssm.controller;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import wf.bitcoin.javabitcoindrpcclient.BitcoinJSONRPCClient;
import wf.bitcoin.javabitcoindrpcclient.BitcoindRpcClient;
import wf.bitcoin.javabitcoindrpcclient.BitcoindRpcClient.BlockChainInfo;
@Controller

public class transCoinController {
	//转账信息输入页面显示
	@RequestMapping("/informationInput")
	public String informationInput()throws Exception{
		return "informationInput";
	}	
	//转账操作
	@RequestMapping(value="/transCoin",method= {RequestMethod.POST,RequestMethod.GET})
//	public static void main(String[] args) throws MalformedURLException {
	public ModelAndView transCoin(HttpServletRequest request,Integer price,String address)throws MalformedURLException{	
		BitcoindRpcClient rpcClient = new BitcoinJSONRPCClient("http://RPCuser:RPCpasswd@localhost:8332");
		
//		BlockChainInfo info = rpcClient.getBlockChainInfo();
	       // MiningInfo info = rpcClient.getMiningInfo();
//	        System.out.println("Mining Information");
//	        System.out.println("------------------");
//	        System.out.println("Chain......: " + info.chain());
//	        System.out.println("Blocks.....: " + info.blocks());
//	        System.out.println("Difficulty.: " + info.difficulty());
	       // System.out.println("Hash Power.: " + new BigDecimal(info.networkHashps()).toPlainString());

//	        String address = rpcClient.getNewAddress("Learning-Bitcoin-from-the-Command-Line");
//	        System.out.println("New Address: " + address);

//	        String privKey = rpcClient.dumpPrivKey(address);
//	        System.out.println("Priv Key: " + privKey);

//	        BlockChainInfo chainInfo = rpcClient.getBlockChainInfo();
//	        String blockHash = rpcClient.getBlockHash(chainInfo.blocks());

//	        System.out.println("Blockchain Info " + chainInfo);
//	        System.out.println("Block Hash: " + blockHash);
//
//	        System.out.println("Balance: " + rpcClient.getBalance());
	        
//	        System.out.println("getBlockHash: " +  rpcClient.getBlockHash(5));
	        
//	        System.out.println("getBlock: " +  rpcClient.getBlock("0000006377ac9f3a74581f79b18b9651a8130aad5cc847482c8eea9f8f9ff543"));
	        
///	        System.out.println("sendtoaddress" + rpcClient.sendToAddress("F63N8bSEuxdpMmviodWuWYs9VMX7hmdwmB", 1));
			String success_info = rpcClient.sendToAddress(address, price);

//	        System.out.println(rpcClient.getRawTransaction("9ea7dbc08323d86a0389dd751df4398c712712282f09874e69b7bd8c55519b4d"));
			List<String> itemsList = new ArrayList<String>();
			itemsList.add(success_info);
	       // System.out.println(rpcClient.getRawTransactionHex(arg0)));
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("itemsList",itemsList);
			modelAndView.setViewName("transcoin_success");
			return modelAndView;
	}

}
