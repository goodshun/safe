package edu.ncu.safe.test;

import android.content.pm.PackageManager.NameNotFoundException;
import android.test.AndroidTestCase;
import android.widget.Toast;

import edu.ncu.safe.db.dao.CommunicationDatabase;
import edu.ncu.safe.domain.InterceptionInfo;
import edu.ncu.safe.engine.LoadAppInfos;

public class AppInfoTest extends AndroidTestCase{
	public void test() throws NameNotFoundException{
		LoadAppInfos infos = new LoadAppInfos(getContext());
		infos.getAllAppInfos();
	}

	public void test2(){
		CommunicationDatabase db = new CommunicationDatabase(getContext());
		InterceptionInfo info = new InterceptionInfo(-1, "yzq" ,"125211", System.currentTimeMillis(), "556sdfasdf", 1);
		boolean b = db.insertOneInterceptionMSGInfo(info);
		int i = db.queryInterceptionMSGCount();
		System.out.println(db.queryInterceptionMSGCount());
		Toast.makeText(getContext(),db.queryInterceptionMSGCount()+"",Toast.LENGTH_LONG).show();
	}

}
