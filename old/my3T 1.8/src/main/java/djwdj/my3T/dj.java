package djwdj.my3T;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.provider.*;
import android.widget.*;
import android.graphics.drawable.*;
import android.content.pm.*;
import java.util.*;

public class dj extends Activity 
{
	//private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
		getWindow().setStatusBarColor(0x00000000);
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            Shortcut();
        }
		
        setContentView(R.layout.m);
		TextView t= (TextView) findViewById(R.id.bb);
		try
		{
			t.setText(new StringBuilder().append("v" + getPackageManager().getPackageInfo(getPackageName(),0).versionName).toString());
		//	Runtime.getRuntime().exec("su");
			
		}
		catch (Exception e)
		{}
//        sp = this.getSharedPreferences("dj", 0);
//		int s = sp.getInt("s",0);
//
//		if(s==1){
//			findViewById(R.id.a).setBackgroundColor(Color.parseColor("#ff0000"));
//			findViewById(R.id.b).setBackgroundColor(Color.parseColor("#ff0000"));
//			
//		}
//		if(s==2){
//			findViewById(R.id.a).setBackgroundColor(Color.parseColor("#0088ff"));
//			findViewById(R.id.b).setBackgroundColor(Color.parseColor("#0088ff"));
//		}
		
		
		
		
    }

	private void Shortcut()
	{
		ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);
		ShortcutInfo shortcut = new ShortcutInfo.Builder(this, "id1")
			.setShortLabel("djwdj.cn")
			.setLongLabel("Open djwdj.cn")
			.setDisabledMessage("Disabled")
			.setIcon(Icon.createWithResource(this, R.drawable.t))
			.setIntent(new Intent(Intent.ACTION_VIEW, Uri.parse("http://djwdj.cn/")))
			.build(),
			shortcut1 = new ShortcutInfo.Builder(this, "id2")
			.setShortLabel("Settings")
			.setLongLabel("Open Settings")
			.setDisabledMessage("Disabled")
			.setIcon(Icon.createWithResource(this, R.drawable.t))
			.setIntent(new Intent(Intent.ACTION_VIEW).setClassName("com.android.settings", "com.android.settings.Settings"))
			.build();
		shortcutManager.setDynamicShortcuts(Arrays.asList(shortcut, shortcut1));
	}
	
	
	public void 进群(View V)
	{
		Intent i = new Intent();
		i.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3DBVuTADpLm3Xoa2d7pQbzed9ulZnONXN5"));
		startActivity(i);
	}
	public void 捐赠(View V)
	{
		Intent i = new Intent();
		i.setData(Uri.parse("alipays://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=https%3A%2F%2Fqr.alipay.com%2FFKX07085RLJMHKMXFUXA5A%3F_s%3Dweb-other"));
		startActivity(i);
	}
	public void zt(View V)
	{
		//startActivity(new Intent().setClassName("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"));
		i("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity");
	}
	public void kt(View v)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.autorun.AutorunMainActivity");
//		startActivity(int1);
		i("com.oneplus.security","com.oneplus.security.autorun.AutorunMainActivity");
		
		}
	public void i(String a,String b)
	{
		Intent i = new Intent();
		i.setClassName(a, b);
		startActivity(i);
		
	}
	
	public void ht(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.cleanbackground.view.ManageBackgroundAppListActivity");
//		startActivity(int1);
		i("com.oneplus.security", "com.oneplus.security.cleanbackground.view.ManageBackgroundAppListActivity");
	}
	public void wl(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.firewall.NetworkRestrictActivity");
//		startActivity(int1);
		i("com.oneplus.security", "com.oneplus.security.firewall.NetworkRestrictActivity");
	}
	public void qx(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.oppermission.OPPermissionMainActivity");
//		startActivity(int1);
		i("com.oneplus.security", "com.oneplus.security.oppermission.OPPermissionMainActivity");
	}
	public void ys(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.applocker.AppLockerSettingsActivity");
//		startActivity(int1);
		i("com.oneplus.security", "com.oneplus.security.applocker.AppLockerSettingsActivity");
	}
	public void wz(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.oneplus.security", "com.oneplus.security.intercept.view.InterceptBlackListActivity");
//		startActivity(int1);
		i("com.android.settings", "com.android.settings.Settings$AccessibilitySettingsActivity");
	}
	public void kf(View V)
	{
//		Intent int1 = new Intent();
//		int1.setClassName("com.android.settings", "com.android.settings.Settings$DevelopmentSettingsActivity");
//		startActivity(int1);
		i("com.android.settings", "com.android.settings.Settings$DevelopmentSettingsActivity");
		
		
	}
	public void l(View v)
	{
		
	}
	public void f(View v)
	{
		if (!Settings.canDrawOverlays(this)) {
			Toast.makeText(this, "请授权浮窗！", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
								   Uri.parse("package:" + getPackageName()));
		startActivityForResult(intent, 0);
		} else {
            startService(new Intent().setClass(this, f.class));
        }
	}
	public void x(View v)
	{
		finish();
	}
//	public void 红(View v){
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.h));
//		
//		}
//		
////		Editor edit = sp.edit();
////		edit.putInt("s",1);
////		edit.commit();
////		startActivity(new Intent(this, dj.class));
////		finish();
//		
//		public void 蓝(View v){
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.l));
//		}
//		public void 绿(View v){
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.r));
//		}
//	public void 黄(View v)
//	{
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.y));
//	}
//	public void 橙(View v)
//	{
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.q));
//	}
//	public void 紫(View v)
//	{
//		findViewById(R.id.a).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.b).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.c).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.d).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.e).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.f).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.g).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//		findViewById(R.id.h).setBackgroundDrawable(getResources().getDrawable(R.drawable.z));
//	}
//		
//		
		
		
		
}

