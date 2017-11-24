package djwdj.my3T;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.RadioGroup.*;
import android.view.ViewGroup.*;
import android.view.*;
import android.util.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.*;
import android.content.*;
import android.provider.*;
import android.net.*;
import android.view.View.*;
import android.graphics.*;
import android.content.pm.PackageManager.*;
import android.content.pm.*;
import android.view.animation.*;
import android.content.SharedPreferences.*;
import java.util.*;
import android.app.ActivityManager.RunningAppProcessInfo;
import java.io.*;

public class l extends Activity 
{
	int p,w,h;
	float d;

	SharedPreferences sp;
	int s,z;
	Editor edit;
	Context c;

	String v;
	LinearLayout l,l0,l1,l11,l12,l13,l2,l3,l31,l32,l33;
	//RelativeLayout l1;
	ScrollView s1;
	
	Button pro;
	//boolean b=true;

	OnClickListener on;

	//boolean mBackKeyPressed = false;

	LayoutParams lk=new LayoutParams(
	LayoutParams.WRAP_CONTENT,
	LayoutParams.WRAP_CONTENT,1);
	
	ViewGroup.LayoutParams ll = new LayoutParams(
		LayoutParams.MATCH_PARENT,
		LayoutParams.WRAP_CONTENT);

	LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
		LinearLayout.LayoutParams.MATCH_PARENT, 
		LinearLayout.LayoutParams.WRAP_CONTENT);

	long firstTime = 0;
	
	@Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
            long secondTime = System.currentTimeMillis();

            if (secondTime - firstTime > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                firstTime = secondTime;
                return true;
            } else {
				finish();
            }
        }

        return super.onKeyUp(keyCode, event);
    }
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
		getWindow().setStatusBarColor(0x00000000);
		
		DisplayMetrics metric = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metric);
		w = metric.widthPixels;
		h = metric.heightPixels;
		d = metric.density;
		p=w/36;

		c=this;

		sp=this.getSharedPreferences("l", 0);
		s = sp.getInt("s",0);
		z = sp.getInt("z",0);
		edit = sp.edit();
		
		on=new OnClickListener(){

			@Override
			public void onClick(View v)
			{
				switch(v.getId()){
					case 0:
						if(l2.isShown()){
							s1.setVisibility(View.GONE);
							l3.setVisibility(View.VISIBLE);
							l0.setBackground(r(w/10,0xffaaaaaa));
							//l.setClickable(false);
							//b=false;
							l0.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
							l.setId(0);
							l.setOnClickListener(on);
						}else{
							recreate();

						}
						break;
					case 1:
						cool(getPackageName());
						break;
					case 2:
						Intent intent = new Intent();
						intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3DX_wurB9Wk8d0fjn0kwJPgkwGCRiUwp2l"));
						startActivity(intent);
						break;
					case 3:
//						try{
//							Intent i = new Intent();
//							i.setClassName("l.c","l.c.l" );
//							startActivity(i);
//							finish();
//						}catch(Exception e){
						cool("l.c");
//						}
						break;
				}

			}

			private void cool(String s)
			{
				Intent i = new Intent();

				i.addCategory("android.intent.category.BROWSABLE");
				i.setData(Uri.parse("https://www.coolapk.com/apk/" + s));
				try
				{
					i.setPackage("com.coolapk.market");
					startActivity(i);
				}
				catch (Exception e)
				{
					i.setPackage(null);
					startActivity(i);
				}
			}
		};
		l=new LinearLayout(this);
		l.setPadding(p,p,p,p);
		l.setOrientation(LinearLayout.VERTICAL);
		l.setGravity(Gravity.CENTER);

		l.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					new Handler().postDelayed(new Runnable(){  
							public void run() {  
								finish();
							}  
						}, 800);  
					TranslateAnimation animation = new TranslateAnimation(0, 0, 0, -2000);
					animation.setDuration(900);
					l.startAnimation(animation);

				}
			});


		TranslateAnimation animation = new TranslateAnimation(0, 0, 1500, 0);
		animation.setDuration(500);
		l.startAnimation(animation);

		LayoutParams la=new LayoutParams(
			LayoutParams.MATCH_PARENT,
			LayoutParams.MATCH_PARENT);

		l0=new LinearLayout(this);
		l0.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,h*2/3));
		l0.setOrientation(LinearLayout.VERTICAL);
		l0.setGravity(Gravity.CENTER);
		l0.setBackground(r(w/10,0x99aaaaaa));
		l.addView(l0);
		
		l1=new LinearLayout(this);
		l1.setOrientation(LinearLayout.HORIZONTAL);
		l1.setPadding(0,0,0,12);
		l1.setId(0);
		l1.setOnClickListener(on);
		l0.addView(l1);

		l11=new LinearLayout(this);
		l11.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT,1));
		l1.addView(l11);
		
		l12=new LinearLayout(this);
		l12.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT,1));
		l1.addView(l12);
		
		l13=new LinearLayout(this);
		l13.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT,1));
		l1.addView(l13);
		
		s1=new ScrollView(this);
		s1.setVerticalScrollBarEnabled(false);
		l0.addView(s1);
		
		l2=new LinearLayout(this);
		l2.setOrientation(LinearLayout.VERTICAL);
		l2.setGravity(Gravity.CENTER);
		s1.addView(l2);
		
		l3=new LinearLayout(this);
		l3.setOrientation(LinearLayout.VERTICAL);
		l3.setGravity(Gravity.CENTER);
		l3.setPadding(20,20,20,20);
		l3.setOnClickListener(on);
		l3.setLayoutParams(ll);
		l3.setVisibility(View.GONE);
		l0.addView(l3);

		t(l3,"主题颜色");

		l31=new LinearLayout(this);
		l(l31);
		l3.addView(l31);

		l32=new LinearLayout(this);
		l(l32);
		l3.addView(l32);

		t(l3,"字体颜色");

		l33=new LinearLayout(this);
		l(l33);
		l3.addView(l33);
		
		t1(l11,Build.DEVICE + "/" + Build.VERSION.SDK_INT);
		pro();
		
		try
		{
			t1(l13,"v" + getPackageManager().getPackageInfo(getPackageName(), 0).versionName );
		}
		catch (PackageManager.NameNotFoundException e)
		{}

		
		
		b1("自启管理","com.oneplus.security",".chainlaunch.view.ChainLaunchAppListActivity");
		b1("开机自启","com.oneplus.security",".autorun.AutorunMainActivity");
		b1("后台冻结","com.oneplus.security",".cleanbackground.view.ManageBackgroundAppListActivity");
		b1("网络控制","com.oneplus.security",".firewall.NetworkRestrictActivity");
		b1("快捷支付","com.android.settings",".Settings$OPQuickPaySettingsActivity");
		b1("权限控制","com.oneplus.security",".oppermission.OPPermissionMainActivity");
		b1("应 用 锁","com.oneplus.security", ".applocker.AppLockerSettingsActivity");
		b1("骚扰管理","com.oneplus.security",".intercept.view.InterceptBlackListActivity");
		b1("短信拦截","com.oneplus.security",".intercept.MmsInterceptPreferenceActivity");
		b1("高耗管理","com.oneplus.security",".highpowerapp.view.HighPowerAppActivity");
		b1("默认应用","com.oneplus.security",".defaultapp.DefaultAppListActivity");
		b1("垃圾清理","com.oneplus.security",".clean.oos.FakeCleanActivity");
		b1("系统服务","com.android.settings",".Settings$AccessibilitySettingsActivity");
		b1("砖家选项","com.android.settings",".Settings$DevelopmentSettingsActivity");
		b1("内存浮窗","l.o",".ff");
		
		o("s",0xff000000,l31);
		o("s",0xff333333,l31);
		o("s",0xff666666,l31);
		o("s",0xff999999,l31);
		o("s",0xffcccccc,l31);
		o("s",0xffffffff,l31);

		o("s",0xffff5555,l32);
		o("s",0xff2196F3,l32);
		o("s",0xff4CAF50,l32);
		o("s",0xffeeee33,l32);
		o("s",0xffFF9800,l32);
		o("s",0xff673AB7,l32);

		o("z",0xffffffff,l33);
		o("z",0xffcccccc,l33);
		o("z",0xff999999,l33);
		o("z",0xff666666,l33);
		o("z",0xff333333,l33);
		o("z",0xff000000,l33);
		
		addContentView(l,la);
    }
	
	private void pro(){
		
		pro=new Button(this);
		b(pro,"One Plus 3T");
		pro.setId(0);
		//pro.setGravity(Gravity.CENTER);
		pro.setLayoutParams(lk);
		pro.setOnClickListener(on);
		pro.setOnLongClickListener(new OnLongClickListener(){

				@Override
				public boolean onLongClick(View p1)
				{
					Intent i = new Intent();
					i.setData(Uri.parse("alipays://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=https%3A%2F%2Fqr.alipay.com%2FFKX07085RLJMHKMXFUXA5A%3F_s%3Dweb-other"));
					startActivity(i);
					return false;
				}
			});
		l12.addView(pro);
	}
	
	private void l(LinearLayout l)
	{
		l.setOrientation(LinearLayout.HORIZONTAL);
		l.setGravity(Gravity.CENTER);
		l.setLayoutParams(ll);
	}
	
	private void o(final String s,final int i,LinearLayout l){
		LinearLayout o=new LinearLayout(this);
		int m=8,ll=120;
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ll, ll);
		lp.setMargins(m,m,m,m);

		o.setLayoutParams(lp);
		o.setBackground(o(i));
		o.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					edit.putInt(s,i).commit();
					if(s.equals("s")){
						pro.setBackground(r(w/5,i));
					}else{
						pro.setTextColor(i);
					}
					//recreate();

					//startActivity(new Intent(con,l.class));
					//finish();
				}
			});
		l.addView(o);

	}
	
	private void t1(LinearLayout l,String n){
		//TextView t=new TextView(this);
		Button t=new Button(this);
		t.setText(n);
		//t.setPadding(20,0,0,0);
		t.setGravity(Gravity.CENTER);
		t.setTextColor(Color.BLACK);
		t.setLayoutParams(lk);
		t.setBackgroundColor(Color.parseColor("#00000000"));
		l.addView(t);
	}
	
	private void t(LinearLayout l,String n){
		TextView t=new TextView(this);
		t.setText(n);
		t.setTextSize(20);
		t.setBackground(r(32,0xff333333,6));
		t.setGravity(Gravity.CENTER);
		t.setTextColor(Color.WHITE);
		t.setLayoutParams(ll);

		l3.addView(t);
	}
	
	private void b1(String n,String i,String ii){
		b(n,i,ii,l2);
	}
	
	private void b(Button b,String n){
		float t=w/d/24;
		b.setText(n);
		b.setTextSize(t);

		if(z!=0){
			b.setTextColor(z);
		}else{
			b.setTextColor(0xffffffff);
		}
		if(s!=0){
			b.setBackground(r(w/5,s));
		}else{
			b.setBackground(r(w/5,0xffff5555));
		}


	}
	private void b(final String n,final String i,final String ii,LinearLayout l)
	{
		int m=w/120;

		//LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		lp.setMargins(m,m,m,m);

		Button b=new Button(this);

		b(b,n);
		b.setLayoutParams(lp);
		b.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
						try{
							Intent int1 = new Intent();
							int1.setClassName(i, i+ii);
							startActivity(int1);
						}catch(Exception e){
							Toast.makeText(c,"可能不支持！",500).show();
						}
				}
			});
		b.setOnLongClickListener(new OnLongClickListener(){

				@Override
				public boolean onLongClick(View p1)
				{

					Intent s = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
					s.putExtra(Intent.EXTRA_SHORTCUT_NAME, n);
					s.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
							   Intent.ShortcutIconResource.fromContext(l.this,R.drawable.l)
							   );

					Intent intent = new Intent(Intent.ACTION_MAIN);
					intent.addCategory(Intent.CATEGORY_DEFAULT);
					intent.setClassName(i, i+ii);

					s.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
					sendBroadcast(s);

					Toast.makeText(c,"创建桌面快捷成功！",500).show();
					return true;
				}
			});
		l.addView(b);
	}
	
	private Drawable r(int r,int c)
	{
		return r(r,c,p);
	}

	private Drawable r(int r,int c,int p)
	{
		ShapeDrawable s = new ShapeDrawable(new RoundRectShape(new float[] {r,r,r,r,r,r,r,r},null,null));
		s.getPaint().setColor(c);
		s.setPadding(p,p,p,p);
		return s;
	}
	private Drawable o(int c)
	{
		GradientDrawable o=new GradientDrawable();
		o.setShape(GradientDrawable.OVAL);
		o.setColor(c);
		return o;

	}
}
