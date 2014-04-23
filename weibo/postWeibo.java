package kfree.soleCollector.weibo;

import weibo4j.Timeline;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

public class postWeibo {
	public static void main(String[] args) throws WeiboException {
		// System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
		// System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
		try {
		Timeline tm = new Timeline();
		tm.client.setToken("2.002T7ztB0to5ruc938bde196hEdxZB");
		Status status = tm.UpdateStatus("测试发表微博");
		System.out.println(status.getId() + " : "+ status.getText()+" "+status.getCreatedAt());

		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
