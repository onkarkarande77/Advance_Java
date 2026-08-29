package com.collection;

import java.util.List;

public class ListData {
        private List<String> stdData;

		public ListData() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ListData(List<String> stdData) {
			super();
			this.stdData = stdData;
		}
        public List<String> getStdData() {
			return stdData;
		}

		public void setStdData(List<String> stdData) {
			this.stdData = stdData;
		}

		public void showStdData() {
			for(String s:stdData) {
        	System.out.println(s);
			}
        }
}
