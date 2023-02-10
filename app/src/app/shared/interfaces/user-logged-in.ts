export interface UserLoggedIn {
  id?: string;
  firstName : string;
  lastName: string;
  email: string;
  password?: string;
  accessToken: string;
  refreshToken: string;
}
