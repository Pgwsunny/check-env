package com.twschool.practice;

public enum direction {
    N {
        @Override
        public direction turnLeft() {
            return W;
        }

        @Override
        public direction turnRight() {
            return E;
        }
    },W {
        @Override
        public direction turnLeft() {
            return S;
        }

        @Override
        public direction turnRight() {
            return N;
        }
    },S {
        @Override
        public direction turnLeft() {
            return E;
        }

        @Override
        public direction turnRight() {
            return W;
        }
    },E {
        @Override
        public direction turnLeft() {
            return N;
        }

        @Override
        public direction turnRight() {
            return S;
        }
    };

    public abstract direction turnLeft();
    public abstract direction turnRight();
}






