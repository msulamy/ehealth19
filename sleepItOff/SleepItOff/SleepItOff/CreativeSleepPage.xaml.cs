﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace SleepItOff
{
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class CreativeSleepPage : ContentPage
	{
        public static CancellationTokenSource tokenSource = new CancellationTokenSource();
        public static CancellationTokenSource token_for_logic = new CancellationTokenSource();
        public CreativeSleepPage ()
		{
            InitializeComponent();
            TimePicker picker = (TimePicker)FindByName("picker");
            Picker songPicker = (Picker)FindByName("SongsPicker");
            picker.Time = DateTime.Now.TimeOfDay;
            Label txt = (Label)FindByName("txt");
            txt.Text = "no current alarm";
        }

        private async void OnButtonClicked(object sender, EventArgs e)
        {
            // cancelling last calls
            if (tokenSource != null)
            {
                tokenSource.Cancel();
            }
            if (token_for_logic != null)
            {
                token_for_logic.Cancel();
            }
            tokenSource = new CancellationTokenSource();
            token_for_logic = new CancellationTokenSource();
            SleepItOff.Utils.buttonClick(sender, e, picker, txt, tokenSource, token_for_logic, (int)AlarmType.CreativeSleep);

        }
        private void cancel(object sender, EventArgs e)
        {
            txt.Text = "no current alarm";
            SleepItOff.Utils.cancel(tokenSource, token_for_logic);
        }
        private void songSelected(object sender, EventArgs e)
        {
            Utils.songSelection(SongsPicker);
        }


    }
}