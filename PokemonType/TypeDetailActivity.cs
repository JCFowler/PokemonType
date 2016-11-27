﻿
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace PokemonType
{
	[Activity(Label = "TypeDetailActivity")]
	public class TypeDetailActivity : Activity
	{
		protected override void OnCreate(Bundle savedInstanceState)
		{
			base.OnCreate(savedInstanceState);
			SetContentView(Resource.Layout.type_detail_layout);

			TextView weakness = FindViewById<TextView>(Resource.Id.weakness);
			TextView resistance = FindViewById<TextView>(Resource.Id.resistance);
			TextView immune = FindViewById<TextView>(Resource.Id.immune);

			weakness.Text = createString(SendData.sendType.effective);
			resistance.Text = createString(SendData.sendType.resistance);
			immune.Text = createString(SendData.sendType.immune);
		}

		public string createString(List<string> list)
		{
			var newString = "";
			foreach (var item in list)
			{
				newString += item + " ";
			}
			return newString;
		}
	}
}
