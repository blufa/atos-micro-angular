export interface UserLoggedIn {
  userId?: string;
  firstName : string;
  lastName: string;
  email: string;
  password?: string;
  accessToken: string;
  refreshToken: string;
}
